package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f31945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f31946c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f31944a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f31944a = Application.getProcessName();
            } else {
                int iMyPid = f31945b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f31945b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                p170j8.r.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                l.a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    l.a(bufferedReader);
                }
                f31944a = strTrim;
            }
        }
        return f31944a;
    }

    public static boolean b() {
        Boolean boolValueOf = f31946c;
        if (boolValueOf == null) {
            if (m.h()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = K8.s.a(Process.class, "isIsolated", new K8.r[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new K8.v(K8.u.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f31946c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
