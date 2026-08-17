package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f31382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f31383b;

    private n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f31382a = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f31383b = fileLockLock;
        } catch (Throwable th) {
            this.f31382a.close();
            throw th;
        }
    }

    public static n a(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f31383b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f31382a.close();
        }
    }
}
