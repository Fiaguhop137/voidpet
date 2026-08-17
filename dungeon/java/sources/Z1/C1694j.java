package Z1;

/* JADX INFO: renamed from: Z1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1694j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18305l;

    private void b(long j10, int i10) {
        this.f18304k += j10;
        this.f18305l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return U1.S.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f18294a), Integer.valueOf(this.f18295b), Integer.valueOf(this.f18296c), Integer.valueOf(this.f18297d), Integer.valueOf(this.f18298e), Integer.valueOf(this.f18299f), Integer.valueOf(this.f18300g), Integer.valueOf(this.f18301h), Integer.valueOf(this.f18302i), Integer.valueOf(this.f18303j), Long.valueOf(this.f18304k), Integer.valueOf(this.f18305l));
    }
}
