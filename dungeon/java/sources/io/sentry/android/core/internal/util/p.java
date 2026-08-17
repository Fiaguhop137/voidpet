package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC3698e0;
import io.sentry.util.AbstractC3807i;
import io.sentry.util.C3799a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f45054c = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3799a f45055a = new C3799a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f45056b = new ArrayList();

    private p() {
    }

    public static p a() {
        return f45054c;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45055a.a();
        try {
            if (!this.f45056b.isEmpty()) {
                List list = this.f45056b;
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strC = AbstractC3807i.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strC != null) {
                            this.f45056b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List list2 = this.f45056b;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return list2;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
