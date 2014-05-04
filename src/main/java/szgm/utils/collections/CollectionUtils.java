package szgm.utils.collections;

import java.util.Collection;

public class CollectionUtils {

	public static boolean isNotEmpty(Collection col) {
		return null != col && false == col.isEmpty();
	}
}
