package com.facebook.react.common.mapbuffer;

import Ad.B;
import Ad.n;
import com.facebook.jni.HybridClassBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002B@B\u0019\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\u0011J\u0017\u0010.\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010'J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0011J\u0017\u00100\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u0010 J\u0017\u00101\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010*J\u0017\u00102\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010'J\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020(H\u0016¢\u0006\u0004\b:\u0010;J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0096\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u001cR$\u0010F\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010\u001c\u001a\u0004\bE\u00105R\u0014\u0010H\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00105¨\u0006J"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/common/mapbuffer/a;", "Ljava/nio/ByteBuffer;", "buffer", "", "offsetToMapBuffer", "<init>", "(Ljava/nio/ByteBuffer;I)V", "offset", "s", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "", "D", "()V", "intKey", "t", "(I)I", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/a$b;", "B", "(I)Lcom/facebook/react/common/mapbuffer/a$b;", "key", "expected", "y", "(ILcom/facebook/react/common/mapbuffer/a$b;)I", "bufferPosition", "LAd/B;", "I", "(I)S", "", "C", "(I)D", "E", "", "F", "(I)J", "", "A", "(I)Z", "", "H", "(I)Ljava/lang/String;", "position", "G", "v", "S", "getInt", "getDouble", "getString", "getBoolean", "w", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/nio/ByteBuffer;", "b", "value", "c", "getCount", "count", "x", "offsetForDynamicData", "d", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableMapBuffer extends HybridClassBase implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a.b[] f29521e = a.b.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offsetToMapBuffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int count;

    private final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29525a;

        public b(int i10) {
            this.f29525a = i10;
        }

        private final void e(a.b bVar) {
            a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double a() {
            e(a.b.DOUBLE);
            return ReadableMapBuffer.this.C(this.f29525a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String b() {
            e(a.b.STRING);
            return ReadableMapBuffer.this.H(this.f29525a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a c() {
            e(a.b.MAP);
            return ReadableMapBuffer.this.G(this.f29525a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean d() {
            e(a.b.BOOL);
            return ReadableMapBuffer.this.A(this.f29525a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int f() {
            e(a.b.INT);
            return ReadableMapBuffer.this.E(this.f29525a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.I(this.f29525a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return D6.b.e() ? ReadableMapBuffer.f29521e[65535 & ReadableMapBuffer.this.I(this.f29525a + 2)] : a.b.values()[65535 & ReadableMapBuffer.this.I(this.f29525a + 2)];
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long k() {
            e(a.b.LONG);
            return ReadableMapBuffer.this.F(this.f29525a + 4);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29527a;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f29527a = iArr;
        }
    }

    public static final class d implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29529b;

        d() {
            this.f29529b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.f29528a;
            this.f29528a = i10 + 1;
            return readableMapBuffer.new b(readableMapBuffer.v(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29528a <= this.f29529b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @p276p6.a
    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = i10;
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(int bufferPosition) {
        return E(bufferPosition) == 1;
    }

    private final a.b B(int bucketIndex) {
        int I10 = I(v(bucketIndex) + 2) & 65535;
        return D6.b.e() ? f29521e[I10] : a.b.values()[I10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double C(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void D() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = I(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long F(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer G(int position) {
        return s(x() + this.buffer.getInt(position) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String H(int bufferPosition) {
        int iX = x() + this.buffer.getInt(bufferPosition);
        int i10 = this.buffer.getInt(iX);
        byte[] bArr = new byte[i10];
        this.buffer.position(iX + 4);
        this.buffer.get(bArr, 0, i10);
        return new String(bArr, Charsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final short I(int bufferPosition) {
        return B.g(this.buffer.getShort(bufferPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence J(a.c entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(entry.getKey());
        sb2.append('=');
        switch (c.f29527a[entry.getType().ordinal()]) {
            case 1:
                sb2.append(entry.d());
                return sb2;
            case 2:
                sb2.append(entry.f());
                return sb2;
            case 3:
                sb2.append(entry.k());
                return sb2;
            case 4:
                sb2.append(entry.a());
                return sb2;
            case 5:
                sb2.append('\"');
                sb2.append(entry.b());
                sb2.append('\"');
                return sb2;
            case 6:
                sb2.append(entry.c().toString());
                return sb2;
            default:
                throw new n();
        }
    }

    private final ReadableMapBuffer s(int offset) {
        ByteBuffer byteBufferDuplicate = this.buffer.duplicate();
        byteBufferDuplicate.position(offset);
        Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, offset);
    }

    private final int t(int intKey) {
        IntRange intRangeA = a.f29538o1.a();
        int iG = intRangeA.g();
        if (intKey <= intRangeA.h() && iG <= intKey) {
            short sG = B.g((short) intKey);
            int count = getCount() - 1;
            int i10 = 0;
            while (i10 <= count) {
                int i11 = (i10 + count) >>> 1;
                int I10 = I(v(i11)) & 65535;
                int i12 = 65535 & sG;
                if (Intrinsics.e(I10, i12) < 0) {
                    i10 = i11 + 1;
                } else {
                    if (Intrinsics.e(I10, i12) <= 0) {
                        return i11;
                    }
                    count = i11 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v(int bucketIndex) {
        return this.offsetToMapBuffer + 8 + (bucketIndex * 12);
    }

    private final int x() {
        return v(getCount());
    }

    private final int y(int key, a.b expected) {
        int iT = t(key);
        if (iT == -1) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        a.b bVarB = B(iT);
        if (bVarB == expected) {
            return v(iT) + 4;
        }
        throw new IllegalStateException(("Expected " + expected + " for key: " + key + ", found " + bVarB + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean S(int key) {
        return t(key) != -1;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int key) {
        return A(y(key, a.b.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int key) {
        return C(y(key, a.b.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int key) {
        return E(y(key, a.b.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int key) {
        return H(y(key, a.b.STRING));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d();
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder("{");
        CollectionsKt___CollectionsKt.p0(this, sb2, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new p402w6.a());
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ReadableMapBuffer D1(int key) {
        return G(y(key, a.b.MAP));
    }
}
