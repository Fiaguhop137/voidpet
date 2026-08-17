package p327s3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0647a f53254e = new C0647a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f53255f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f53257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f53258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f53259d;

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    public static final class C0647a {
        private C0647a() {
        }

        public /* synthetic */ C0647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f53255f) {
                try {
                    Map map = a.f53255f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }
    }

    public a(String name, File file, boolean z10) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f53256a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f53257b = file2;
        this.f53258c = f53254e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f53256a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f53258c.lock();
        if (z10) {
            try {
                File file = this.f53257b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f53257b).getChannel();
                channel.lock();
                this.f53259d = channel;
            } catch (IOException e10) {
                this.f53259d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f53259d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f53258c.unlock();
    }
}
