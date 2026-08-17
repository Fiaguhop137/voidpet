package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC3662p0;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f44959e;

    public b(Context context, ILogger iLogger) {
        super(iLogger);
        this.f44959e = AbstractC3662p0.g(context);
        new Thread(new a(this)).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f44959e.getAssets().open("sentry-external-modules.txt");
            try {
                Map mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.f45915a.c(EnumC3721i3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e10) {
            this.f45915a.b(EnumC3721i3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
