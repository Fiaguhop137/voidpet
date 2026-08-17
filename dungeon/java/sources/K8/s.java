package K8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static Object a(Class cls, String str, r... rVarArr) {
        return c(cls, "isIsolated", null, false, rVarArr);
    }

    public static Object b(String str, String str2, ClassLoader classLoader, r... rVarArr) {
        return c(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, rVarArr);
    }

    private static Object c(Class cls, String str, Object obj, boolean z10, r... rVarArr) {
        int length = rVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            rVar.getClass();
            clsArr[i10] = rVar.b();
            objArr[i10] = rVarArr[i10].c();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
