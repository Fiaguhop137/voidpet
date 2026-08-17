package B7;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f589c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f591b;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f592a = new a(null);
    }

    private a() {
        this.f590a = new ArrayList();
        this.f591b = new AtomicInteger(0);
    }

    /* synthetic */ a(C0011a c0011a) {
        this();
    }

    public static a b() {
        return b.f592a;
    }

    public int a() {
        return this.f591b.getAndIncrement();
    }

    public Looper c(int i10) {
        Looper looper;
        int i11 = i10 % f589c;
        if (i11 < this.f590a.size()) {
            return (this.f590a.get(i11) == null || (looper = ((HandlerThread) this.f590a.get(i11)).getLooper()) == null) ? Looper.getMainLooper() : looper;
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
        handlerThread.start();
        this.f590a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }
}
