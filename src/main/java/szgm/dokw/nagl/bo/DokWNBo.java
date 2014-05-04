package szgm.dokw.nagl.bo;

import java.util.Date;
import java.util.List;

import szgm.core.BaseBo;
import szgm.dokw.nagl.model.DokWN;

public interface DokWNBo extends BaseBo<DokWN> {

	public List<DokWN> getDokW(Date DataOd, Date dataDo);

}