package Zd;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Xd.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f18975k = {F.j(new kotlin.jvm.internal.w(k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f18976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Function0 f18977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Qe.i f18978j;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18983e = Gd.a.a(e());
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H f18984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f18985b;

        public b(H ownerModuleDescriptor, boolean z10) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f18984a = ownerModuleDescriptor;
            this.f18985b = z10;
        }

        public final H a() {
            return this.f18984a;
        }

        public final boolean b() {
            return this.f18985b;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18986a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18986a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Qe.n storageManager, a kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f18976h = kind;
        this.f18978j = storageManager.c(new h(this, storageManager));
        int i10 = c.f18986a[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new Ad.n();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J0(k kVar, Qe.n nVar) {
        p069de.F fS = kVar.s();
        Intrinsics.checkNotNullExpressionValue(fS, "getBuiltInsModule(...)");
        return new u(fS, nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b K0(k kVar) {
        Function0 function0 = kVar.f18977i;
        if (function0 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) function0.invoke();
        kVar.f18977i = null;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b O0(H h10, boolean z10) {
        return new b(h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xd.i
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List w() {
        Iterable iterableW = super.w();
        Intrinsics.checkNotNullExpressionValue(iterableW, "getClassDescriptorFactories(...)");
        Qe.n nVarV = V();
        Intrinsics.checkNotNullExpressionValue(nVarV, "getStorageManager(...)");
        p069de.F fS = s();
        Intrinsics.checkNotNullExpressionValue(fS, "getBuiltInsModule(...)");
        return CollectionsKt.B0(iterableW, new g(nVarV, fS, null, 4, null));
    }

    public final u M0() {
        return (u) Qe.m.a(this.f18978j, this, f18975k[0]);
    }

    @Override // Xd.i
    protected p051ce.c N() {
        return M0();
    }

    public final void N0(H moduleDescriptor, boolean z10) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        P0(new i(moduleDescriptor, z10));
    }

    public final void P0(Function0 computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f18977i = computation;
    }

    @Override // Xd.i
    protected p051ce.a g() {
        return M0();
    }
}
