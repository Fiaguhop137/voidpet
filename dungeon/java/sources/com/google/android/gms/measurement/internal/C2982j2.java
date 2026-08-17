package com.google.android.gms.measurement.internal;

import T8.InterfaceC1458l;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2982j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f35621b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f35622c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f35623d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1458l f35624a;

    public C2982j2(InterfaceC1458l interfaceC1458l) {
        this.f35624a = interfaceC1458l;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        p170j8.r.l(strArr);
        p170j8.r.l(strArr2);
        p170j8.r.l(atomicReference);
        p170j8.r.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35624a.zza() ? str : g(str, T8.w.f12369c, T8.w.f12367a, f35621b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35624a.zza() ? str : g(str, T8.x.f12372b, T8.x.f12371a, f35622c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f35624a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, T8.y.f12376b, T8.y.f12375a, f35623d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(G g10) {
        String string;
        InterfaceC1458l interfaceC1458l = this.f35624a;
        if (!interfaceC1458l.zza()) {
            return g10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(g10.f35008c);
        sb2.append(",name=");
        sb2.append(a(g10.f35006a));
        sb2.append(",params=");
        E e10 = g10.f35007b;
        if (e10 == null) {
            string = null;
        } else {
            string = !interfaceC1458l.zza() ? e10.toString() : e(e10.e4());
        }
        sb2.append(string);
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f35624a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb2.append(strF);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
