package szgm.dokw.poz.bo;

import java.util.List;

import szgm.core.BaseBo;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.model.DokWP;

public interface DokWPBo extends BaseBo<DokWP> {

	List<DokWP> findAllForDocument(DokWN dok);

}