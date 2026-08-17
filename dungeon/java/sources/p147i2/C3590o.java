package p147i2;

import U1.AbstractC1459a;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.util.concurrent.h;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: i2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3590o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f43709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f43711c;

    /* JADX INFO: renamed from: i2.o$a */
    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return C3590o.this.f43710b.a(bundle);
        }
    }

    /* JADX INFO: renamed from: i2.o$b */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43713a = new C3591p();

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }

        Bundle a(Bundle bundle);
    }

    public C3590o() {
        this(b.f43713a);
    }

    public C3590o(b bVar) {
        this.f43709a = new HashSet();
        this.f43710b = bVar;
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f43711c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC1459a.g(this.f43709a.add(mediaCodec));
        }
    }

    public void c() {
        this.f43709a.clear();
        LoudnessCodecController loudnessCodecController = this.f43711c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f43709a.remove(mediaCodec) || (loudnessCodecController = this.f43711c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f43711c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f43711c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, h.a(), new a());
        this.f43711c = loudnessCodecControllerCreate;
        Iterator it = this.f43709a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
