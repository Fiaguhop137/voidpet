package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24853a;

    e(long j10) {
        this.f24853a = j10;
    }

    public long g() {
        return this.f24853a;
    }
}
