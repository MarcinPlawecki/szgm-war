package szgm.raport;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.dokp.nagl.bo.DokPNBo;
import szgm.dokw.nagl.bo.DokWNBo;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.model.DokWP;

@ManagedBean(name = "raport")
@SessionScoped
public class RaportBean implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;

	private DokWNBo dokWBo;

	private DokPNBo dokPBo;

	public String generujSprzedaz() {
		List<DokWN> lista = dokWBo.getDokW(dataOd, dataDo);

		Map<String, Double> model = new HashMap<String, Double>();

		for (DokWN nagl : lista) {
			for (DokWP poz : nagl.getPozycje()) {
				String g = poz.getTowar().getGrupa().getNazwa();
				Double newVal = poz.getCenaSprzedazyNetto() * poz.getIlosc();
				if (model.containsKey(g)) {
					newVal = newVal + model.get(g).doubleValue();
				}
				model.put(g, newVal);
			}
		}

		sprzedazModel = new CartesianChartModel();

		LineChartSeries series1 = new LineChartSeries();
		series1.setLabel("Grupy");

		for (Map.Entry<String, Double> entry : model.entrySet()) {
			series1.set(entry.getKey(), entry.getValue());
		}

		sprzedazModel.addSeries(series1);

		return "success";
	}

	public String generujMarze() {
		List<DokWN> lista = dokWBo.getDokW(dataOd, dataDo);

		Map<String, Double> model = new HashMap<String, Double>();

		for (DokWN nagl : lista) {
			for (DokWP poz : nagl.getPozycje()) {
				String g = poz.getTowar().getGrupa().getNazwa();
				Double newVal = poz.getCenaSprzedazyNetto() * poz.getIlosc();
				if (model.containsKey(g)) {
					newVal = newVal + model.get(g).doubleValue();
				}
				model.put(g, newVal);
			}
		}

		sprzedazModel = new CartesianChartModel();

		LineChartSeries series1 = new LineChartSeries();
		series1.setLabel("Grupy");

		for (Map.Entry<String, Double> entry : model.entrySet()) {
			series1.set(entry.getKey(), entry.getValue());
		}

		sprzedazModel.addSeries(series1);

		return "success";
	}

	private Date dataOd;

	private Date dataDo;

	private CartesianChartModel sprzedazModel;

	private CartesianChartModel marzaModel;

	public Date getDataOd() {
		return dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataDo() {
		return dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public CartesianChartModel getSprzedazModel() {
		return sprzedazModel;
	}

	public void setSprzedazModel(CartesianChartModel sprzedazModel) {
		this.sprzedazModel = sprzedazModel;
	}

	public CartesianChartModel getMarzaModel() {
		return marzaModel;
	}

	public void setMarzaModel(CartesianChartModel marzaModel) {
		this.marzaModel = marzaModel;
	}

	public DokWNBo getDokWBo() {
		return dokWBo;
	}

	public void setDokWBo(DokWNBo dokWBo) {
		this.dokWBo = dokWBo;
	}

	public DokPNBo getDokPBo() {
		return dokPBo;
	}

	public void setDokPBo(DokPNBo dokPBo) {
		this.dokPBo = dokPBo;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(dokWBo, "dokWBo can't be null");
		Assert.notNull(dokPBo, "dokPBo can't be null");
	}

}
