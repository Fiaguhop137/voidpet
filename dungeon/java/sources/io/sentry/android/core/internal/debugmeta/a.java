package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC3662p0;
import io.sentry.util.AbstractC3802d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f44929b;

    public a(Context context, ILogger iLogger) {
        this.f44928a = AbstractC3662p0.g(context);
        this.f44929b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f44928a.getAssets().open(AbstractC3802d.f46567a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.f44929b.c(EnumC3721i3.INFO, "%s file was not found.", AbstractC3802d.f46567a);
            return null;
        } catch (IOException e10) {
            this.f44929b.b(EnumC3721i3.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.f44929b.a(EnumC3721i3.ERROR, e11, "%s file is malformed.", AbstractC3802d.f46567a);
            return null;
        }
    }
}
