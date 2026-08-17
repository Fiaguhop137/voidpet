package io.sentry.internal.modules;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.util.C3799a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f45914d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ILogger f45915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3799a f45916b = new C3799a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map f45917c = null;

    public d(ILogger iLogger) {
        this.f45915a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        if (this.f45917c == null) {
            InterfaceC3698e0 interfaceC3698e0A = this.f45916b.a();
            try {
                if (this.f45917c == null) {
                    this.f45917c = b();
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
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
        return this.f45917c;
    }

    protected abstract Map b();

    protected Map c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f45914d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f45915a.c(EnumC3721i3.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.f45915a.b(EnumC3721i3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.f45915a.a(EnumC3721i3.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
