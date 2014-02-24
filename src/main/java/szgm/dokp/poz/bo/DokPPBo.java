package szgm.dokp.poz.bo;

import java.util.List;

import szgm.core.BaseBo;
import szgm.dokp.nagl.model.DokPN;
import szgm.dokp.poz.model.DokPP;

public interface DokPPBo extends BaseBo<DokPP> {

	List<DokPP> findAllForDocument(DokPN dok);

}