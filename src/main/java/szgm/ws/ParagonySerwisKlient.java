package szgm.ws;

import java.util.List;

import szgm.Paragon;
import szgm.ParagonySerwis;
import szgm.ParagonySerwisImplService;

public class ParagonySerwisKlient {

	public List<Paragon> pobierz() {
		ParagonySerwisImplService serviceImpl = new ParagonySerwisImplService();
		ParagonySerwis service = serviceImpl.getParagonySerwisImplPort();

		return service.pobierzParagony();
	}
}
