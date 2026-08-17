package p392ve;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p410we.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0720a f56346g = new C0720a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f56347h = new a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f56348i = new a(new int[0]);

    /* JADX INFO: renamed from: ve.a$a, reason: collision with other inner class name */
    public static final class C0720a {
        private C0720a() {
        }

        public /* synthetic */ C0720a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(CollectionsKt.w(intRange, 10));
            Iterator it = intRange.iterator();
            while (it.hasNext()) {
                ((K) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrT0 = CollectionsKt.T0(arrayList);
            return new a(Arrays.copyOf(iArrT0, iArrT0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public boolean h() {
        return f(f56347h);
    }
}
