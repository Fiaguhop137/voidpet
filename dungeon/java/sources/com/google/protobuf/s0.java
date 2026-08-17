package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum s0 implements A.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final A.d f38026f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38028a;

    class a implements A.d {
        a() {
        }

        @Override // com.google.protobuf.A.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0 a(int i10) {
            return s0.e(i10);
        }
    }

    s0(int i10) {
        this.f38028a = i10;
    }

    public static s0 e(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i10 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // com.google.protobuf.A.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38028a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
