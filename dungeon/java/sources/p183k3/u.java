package p183k3;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import p219m3.b;
import p219m3.c;
import p291q3.g;
import p291q3.h;
import p327s3.a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f47942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callable f47943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f47945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f47946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47947h;

    public u(Context context, String str, File file, Callable callable, int i10, h delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f47940a = context;
        this.f47941b = str;
        this.f47942c = file;
        this.f47943d = callable;
        this.f47944e = i10;
        this.f47945f = delegate;
    }

    private final void b(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f47941b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f47940a.getAssets().open(this.f47941b));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f47942c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f47942c).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f47943d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f47940a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        c(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void c(File file, boolean z10) {
        f fVar = this.f47946g;
        if (fVar == null) {
            Intrinsics.r("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void e(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f47940a.getDatabasePath(databaseName);
        f fVar = this.f47946g;
        f fVar2 = null;
        if (fVar == null) {
            Intrinsics.r("databaseConfiguration");
            fVar = null;
        }
        a aVar = new a(databaseName, this.f47940a.getFilesDir(), fVar.f47865s);
        try {
            a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    b(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int iC = b.c(databaseFile);
                if (iC == this.f47944e) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f47946g;
                if (fVar3 == null) {
                    Intrinsics.r("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(iC, this.f47944e)) {
                    aVar.d();
                    return;
                }
                if (this.f47940a.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    @Override // p291q3.h
    public g X2() {
        if (!this.f47947h) {
            e(true);
            this.f47947h = true;
        }
        return a().X2();
    }

    @Override // p183k3.g
    public h a() {
        return this.f47945f;
    }

    @Override // p291q3.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f47947h = false;
    }

    public final void d(f databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f47946g = databaseConfiguration;
    }

    @Override // p291q3.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // p291q3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
