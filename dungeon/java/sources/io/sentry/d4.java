package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements ILogger {
    private String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(EnumC3721i3 enumC3721i3, Throwable th, String str, Object... objArr) {
        if (th == null) {
            c(enumC3721i3, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC3721i3, String.format(str, objArr), th.toString(), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC3721i3 enumC3721i3, String str, Throwable th) {
        if (th == null) {
            c(enumC3721i3, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC3721i3, String.format(str, th.toString()), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC3721i3 enumC3721i3, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC3721i3, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC3721i3 enumC3721i3) {
        return true;
    }
}
