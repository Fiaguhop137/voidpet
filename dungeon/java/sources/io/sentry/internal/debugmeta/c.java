package io.sentry.internal.debugmeta;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC3800b;
import io.sentry.util.AbstractC3802d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f45901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f45902b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    c(ILogger iLogger, ClassLoader classLoader) {
        this.f45901a = iLogger;
        this.f45902b = AbstractC3800b.a(classLoader);
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f45902b.getResources(AbstractC3802d.f46567a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f45901a.c(EnumC3721i3.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e10) {
                    this.f45901a.a(EnumC3721i3.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e11) {
            this.f45901a.a(EnumC3721i3.ERROR, e11, "Failed to load %s", AbstractC3802d.f46567a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f45901a.c(EnumC3721i3.INFO, "No %s file was found.", AbstractC3802d.f46567a);
        return null;
    }
}
