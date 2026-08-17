package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements A.c {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    NONE(5),
    UNRECOGNIZED(-1);

    public static final int ARM32_VALUE = 0;
    public static final int ARM64_VALUE = 1;
    public static final int NONE_VALUE = 5;
    public static final int RISCV64_VALUE = 4;
    public static final int X86_64_VALUE = 3;
    public static final int X86_VALUE = 2;
    private static final A.d internalValueMap = new a();
    private final int value;

    class a implements A.d {
        a() {
        }

        @Override // com.google.protobuf.A.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.forNumber(i10);
        }
    }

    private static final class b implements A.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final A.e f44997a = new b();

        private b() {
        }

        @Override // com.google.protobuf.A.e
        public boolean a(int i10) {
            return d.forNumber(i10) != null;
        }
    }

    d(int i10) {
        this.value = i10;
    }

    public static d forNumber(int i10) {
        if (i10 == 0) {
            return ARM32;
        }
        if (i10 == 1) {
            return ARM64;
        }
        if (i10 == 2) {
            return X86;
        }
        if (i10 == 3) {
            return X86_64;
        }
        if (i10 == 4) {
            return RISCV64;
        }
        if (i10 != 5) {
            return null;
        }
        return NONE;
    }

    public static A.d internalGetValueMap() {
        return internalValueMap;
    }

    public static A.e internalGetVerifier() {
        return b.f44997a;
    }

    @Deprecated
    public static d valueOf(int i10) {
        return forNumber(i10);
    }

    @Override // com.google.protobuf.A.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
