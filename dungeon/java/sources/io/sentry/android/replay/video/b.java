package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f45606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaMuxer f45607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45611f;

    public b(String path, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f45606a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f45607b = new MediaMuxer(path, 0);
    }

    public long a() {
        if (this.f45610e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f45611f + this.f45606a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f45608c;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j10 = this.f45606a;
        int i10 = this.f45610e;
        this.f45610e = i10 + 1;
        long j11 = j10 * ((long) i10);
        this.f45611f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f45607b.writeSampleData(this.f45609d, encodedData, bufferInfo);
    }

    public void d() {
        this.f45607b.stop();
        this.f45607b.release();
    }

    public void e(MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.f45609d = this.f45607b.addTrack(videoFormat);
        this.f45607b.start();
        this.f45608c = true;
    }
}
