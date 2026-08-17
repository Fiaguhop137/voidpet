package io.sentry.config;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f45779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45780c;

    public e(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    public e(String str, ILogger iLogger, boolean z10) {
        this.f45778a = str;
        this.f45779b = iLogger;
        this.f45780c = z10;
    }

    public Properties a() {
        try {
            File file = new File(this.f45778a.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        this.f45779b.c(EnumC3721i3.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.f45778a);
                    }
                } else if (this.f45780c) {
                    this.f45779b.c(EnumC3721i3.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.f45778a);
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45779b.a(EnumC3721i3.ERROR, th3, "Failed to load Sentry configuration from file: %s", this.f45778a);
            return null;
        }
    }
}
