package Q6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p133h6.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f9502D = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ReadableMap f9503B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Q6.a f9504C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, p133h6.c cVar, ReadableMap readableMap, Q6.a aVar2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                aVar2 = Q6.a.DEFAULT;
            }
            return aVar.a(cVar, readableMap, aVar2);
        }

        public final b a(p133h6.c builder, ReadableMap readableMap, Q6.a cacheControl) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            return new b(builder, readableMap, cacheControl, null);
        }
    }

    private b(p133h6.c cVar, ReadableMap readableMap, Q6.a aVar) {
        super(cVar);
        this.f9503B = readableMap;
        this.f9504C = aVar;
    }

    public /* synthetic */ b(p133h6.c cVar, ReadableMap readableMap, Q6.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, readableMap, aVar);
    }

    public final Q6.a A() {
        return this.f9504C;
    }

    public final ReadableMap B() {
        return this.f9503B;
    }
}
