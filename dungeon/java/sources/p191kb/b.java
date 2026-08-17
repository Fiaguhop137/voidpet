package p191kb;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    Object a(String str);

    default List b(String str) {
        return e(str, null);
    }

    Collection c();

    default b d(String str) {
        Object objA = a(str);
        if (objA instanceof Map) {
            return new a((Map) objA);
        }
        return null;
    }

    List e(String str, List list);

    Map f(String str, Map map);

    boolean g(String str);

    default boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    boolean getBoolean(String str, boolean z10);

    default int getInt(String str) {
        return getInt(str, 0);
    }

    int getInt(String str, int i10);

    default Map getMap(String str) {
        return f(str, null);
    }

    default String getString(String str) {
        return getString(str, null);
    }

    String getString(String str, String str2);
}
