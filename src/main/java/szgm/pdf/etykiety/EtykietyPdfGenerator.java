package szgm.pdf.etykiety;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import szgm.towar.model.Towar;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.Barcode;
import com.lowagie.text.pdf.BarcodeEAN;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class EtykietyPdfGenerator implements Serializable {

	private static final long serialVersionUID = 1L;

	public ByteArrayOutputStream generate(Map<Towar, Integer> doWydruku)
			throws DocumentException, IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		Document document = new Document();
		PdfWriter.getInstance(document, stream);

		document.open();

		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100);

		Font nazwaF = new Font(BaseFont.createFont(), 12);
		Font cenaF = new Font(BaseFont.createFont(), 10);

		for (Map.Entry<Towar, Integer> entry : doWydruku.entrySet()) {
			BarcodeEAN codeEAN = new BarcodeEAN();
			codeEAN.setCodeType(Barcode.EAN13);
			codeEAN.setCode(entry.getKey().getKodKreskowy());

			java.awt.Image awtImg = codeEAN.createAwtImage(Color.black,
					Color.white);

			Image itextImage = Image.getInstance(Toolkit.getDefaultToolkit()
					.createImage(awtImg.getSource()), null);
			itextImage.scaleToFit(100F, 50F);

			for (int i = 0; i < entry.getValue(); i++) {
				PdfPCell cell = new PdfPCell();
				cell.setFixedHeight(80F);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);

				cell.addElement(new Paragraph(entry.getKey().getNazwa(), nazwaF));
				String cena = String.valueOf(entry.getKey().getCenaNetto())
						+ " " + entry.getKey().getWaluta().getSymbol();
				cell.addElement(new Paragraph(cena, cenaF));

				Chunk c = new Chunk(itextImage, 5F, 5F);
				Phrase p = new Phrase(c);
				p.setLeading(5F);
				Paragraph pp = new Paragraph(p);
				pp.setSpacingBefore(5F);
				cell.addElement(pp);

				table.addCell(cell);
			}
		}

		document.add(table);

		document.close();
		stream.close();

		return stream;
	}

}
