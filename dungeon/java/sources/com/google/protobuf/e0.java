package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum e0 implements A.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final A.d f37902d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37904a;

    class a implements A.d {
        a() {
        }

        @Override // com.google.protobuf.A.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(int i10) {
            return e0.e(i10);
        }
    }

    e0(int i10) {
        this.f37904a = i10;
    }

    public static e0 e(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // com.google.protobuf.A.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37904a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
