package szgm.utils.collections;

import java.util.Collection;

import oracle.net.aso.e;

public class CollectionUtils {

	public static boolean isNotEmpty(Collection<e> col) {
		return null != col && false == col.isEmpty();
	}
}
