package Ce;

import Re.S;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p015ae.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements w {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f1926Z = {kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "startFromName", "getStartFromName()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "debugMode", "getDebugMode()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "verbose", "getVerbose()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "unitReturnType", "getUnitReturnType()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), kotlin.jvm.internal.F.d(new kotlin.jvm.internal.q(z.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Pd.d f1927A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Pd.d f1928B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Pd.d f1929C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Pd.d f1930D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Pd.d f1931E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Pd.d f1932F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Pd.d f1933G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Pd.d f1934H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Pd.d f1935I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Pd.d f1936J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Pd.d f1937K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Pd.d f1938L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Pd.d f1939M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Pd.d f1940N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pd.d f1941O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Pd.d f1942P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final Pd.d f1943Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Pd.d f1944R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Pd.d f1945S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Pd.d f1946T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Pd.d f1947U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final Pd.d f1948V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Pd.d f1949W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Pd.d f1950X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final Pd.d f1951Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pd.d f1953b = r0(InterfaceC0906b.c.f1866a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pd.d f1954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pd.d f1955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pd.d f1956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pd.d f1957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pd.d f1958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Pd.d f1959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Pd.d f1960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pd.d f1961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Pd.d f1962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Pd.d f1963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Pd.d f1964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pd.d f1965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Pd.d f1966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Pd.d f1967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Pd.d f1968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Pd.d f1969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Pd.d f1970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pd.d f1971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Pd.d f1972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Pd.d f1973v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Pd.d f1974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Pd.d f1975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Pd.d f1976y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Pd.d f1977z;

    public static final class a extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f1978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f1978b = zVar;
        }

        @Override // Pd.b
        protected boolean d(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (this.f1978b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f1954c = r0(bool);
        this.f1955d = r0(bool);
        this.f1956e = r0(v.f1905c);
        Boolean bool2 = Boolean.FALSE;
        this.f1957f = r0(bool2);
        this.f1958g = r0(bool2);
        this.f1959h = r0(bool2);
        this.f1960i = r0(bool2);
        this.f1961j = r0(bool2);
        this.f1962k = r0(bool);
        this.f1963l = r0(bool2);
        this.f1964m = r0(bool2);
        this.f1965n = r0(bool2);
        this.f1966o = r0(bool);
        this.f1967p = r0(bool);
        this.f1968q = r0(bool2);
        this.f1969r = r0(bool2);
        this.f1970s = r0(bool2);
        this.f1971t = r0(bool2);
        this.f1972u = r0(bool2);
        this.f1973v = r0(null);
        this.f1974w = r0(bool2);
        this.f1975x = r0(bool2);
        this.f1976y = r0(x.f1924a);
        this.f1977z = r0(y.f1925a);
        this.f1927A = r0(bool);
        this.f1928B = r0(C.RENDER_OPEN);
        this.f1929C = r0(n.b.a.f1891a);
        this.f1930D = r0(F.f1853a);
        this.f1931E = r0(D.ALL);
        this.f1932F = r0(bool2);
        this.f1933G = r0(bool2);
        this.f1934H = r0(E.DEBUG);
        this.f1935I = r0(bool2);
        this.f1936J = r0(bool2);
        this.f1937K = r0(W.d());
        this.f1938L = r0(A.f1835a.a());
        this.f1939M = r0(null);
        this.f1940N = r0(EnumC0905a.NO_ARGUMENTS);
        this.f1941O = r0(bool2);
        this.f1942P = r0(bool);
        this.f1943Q = r0(bool);
        this.f1944R = r0(bool2);
        this.f1945S = r0(bool2);
        this.f1946T = r0(bool);
        this.f1947U = r0(bool);
        this.f1948V = r0(bool2);
        this.f1949W = r0(bool2);
        this.f1950X = r0(bool2);
        this.f1951Y = r0(bool);
    }

    private final Pd.d r0(Object obj) {
        Pd.a aVar = Pd.a.f8891a;
        return new a(obj, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S s0(S it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(t0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "...";
    }

    public Function1 A() {
        return (Function1) this.f1977z.a(this, f1926Z[24]);
    }

    public boolean B() {
        return ((Boolean) this.f1936J.a(this, f1926Z[34])).booleanValue();
    }

    public Set C() {
        return (Set) this.f1937K.a(this, f1926Z[35]);
    }

    public boolean D() {
        return ((Boolean) this.f1946T.a(this, f1926Z[44])).booleanValue();
    }

    public boolean E() {
        return w.a.a(this);
    }

    public boolean F() {
        return w.a.b(this);
    }

    public boolean G() {
        return ((Boolean) this.f1972u.a(this, f1926Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f1951Y.a(this, f1926Z[49])).booleanValue();
    }

    public Set I() {
        return (Set) this.f1956e.a(this, f1926Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f1965n.a(this, f1926Z[12])).booleanValue();
    }

    public C K() {
        return (C) this.f1928B.a(this, f1926Z[26]);
    }

    public D L() {
        return (D) this.f1931E.a(this, f1926Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f1947U.a(this, f1926Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f1949W.a(this, f1926Z[47])).booleanValue();
    }

    public E O() {
        return (E) this.f1934H.a(this, f1926Z[32]);
    }

    public Function1 P() {
        return (Function1) this.f1973v.a(this, f1926Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f1932F.a(this, f1926Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f1945S.a(this, f1926Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f1933G.a(this, f1926Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f1968q.a(this, f1926Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f1942P.a(this, f1926Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f1935I.a(this, f1926Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f1967p.a(this, f1926Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f1966o.a(this, f1926Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f1969r.a(this, f1926Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f1944R.a(this, f1926Z[42])).booleanValue();
    }

    @Override // Ce.w
    public void a(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<set-?>");
        this.f1930D.b(this, f1926Z[28], f10);
    }

    public boolean a0() {
        return ((Boolean) this.f1943Q.a(this, f1926Z[41])).booleanValue();
    }

    @Override // Ce.w
    public void b(boolean z10) {
        this.f1957f.b(this, f1926Z[4], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.f1927A.a(this, f1926Z[25])).booleanValue();
    }

    @Override // Ce.w
    public void c(boolean z10) {
        this.f1954c.b(this, f1926Z[1], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f1958g.a(this, f1926Z[5])).booleanValue();
    }

    @Override // Ce.w
    public boolean d() {
        return ((Boolean) this.f1964m.a(this, f1926Z[11])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f1957f.a(this, f1926Z[4])).booleanValue();
    }

    @Override // Ce.w
    public void e(InterfaceC0906b interfaceC0906b) {
        Intrinsics.checkNotNullParameter(interfaceC0906b, "<set-?>");
        this.f1953b.b(this, f1926Z[0], interfaceC0906b);
    }

    public F e0() {
        return (F) this.f1930D.a(this, f1926Z[28]);
    }

    @Override // Ce.w
    public void f(boolean z10) {
        this.f1975x.b(this, f1926Z[22], Boolean.valueOf(z10));
    }

    public Function1 f0() {
        return (Function1) this.f1976y.a(this, f1926Z[23]);
    }

    @Override // Ce.w
    public void g(boolean z10) {
        this.f1932F.b(this, f1926Z[30], Boolean.valueOf(z10));
    }

    public boolean g0() {
        return ((Boolean) this.f1971t.a(this, f1926Z[18])).booleanValue();
    }

    @Override // Ce.w
    public Set h() {
        return (Set) this.f1938L.a(this, f1926Z[36]);
    }

    public boolean h0() {
        return ((Boolean) this.f1962k.a(this, f1926Z[9])).booleanValue();
    }

    @Override // Ce.w
    public boolean i() {
        return ((Boolean) this.f1959h.a(this, f1926Z[6])).booleanValue();
    }

    public n.b i0() {
        return (n.b) this.f1929C.a(this, f1926Z[27]);
    }

    @Override // Ce.w
    public EnumC0905a j() {
        return (EnumC0905a) this.f1940N.a(this, f1926Z[38]);
    }

    public boolean j0() {
        return ((Boolean) this.f1961j.a(this, f1926Z[8])).booleanValue();
    }

    @Override // Ce.w
    public void k(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f1938L.b(this, f1926Z[36], set);
    }

    public boolean k0() {
        return ((Boolean) this.f1954c.a(this, f1926Z[1])).booleanValue();
    }

    @Override // Ce.w
    public void l(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f1956e.b(this, f1926Z[3], set);
    }

    public boolean l0() {
        return ((Boolean) this.f1955d.a(this, f1926Z[2])).booleanValue();
    }

    @Override // Ce.w
    public void m(boolean z10) {
        this.f1959h.b(this, f1926Z[6], Boolean.valueOf(z10));
    }

    public boolean m0() {
        return ((Boolean) this.f1963l.a(this, f1926Z[10])).booleanValue();
    }

    @Override // Ce.w
    public void n(boolean z10) {
        this.f1933G.b(this, f1926Z[31], Boolean.valueOf(z10));
    }

    public boolean n0() {
        return ((Boolean) this.f1975x.a(this, f1926Z[22])).booleanValue();
    }

    @Override // Ce.w
    public void o(D d10) {
        Intrinsics.checkNotNullParameter(d10, "<set-?>");
        this.f1931E.b(this, f1926Z[29], d10);
    }

    public boolean o0() {
        return ((Boolean) this.f1974w.a(this, f1926Z[21])).booleanValue();
    }

    @Override // Ce.w
    public void p(boolean z10) {
        this.f1974w.b(this, f1926Z[21], Boolean.valueOf(z10));
    }

    public final boolean p0() {
        return this.f1952a;
    }

    public final void q0() {
        this.f1952a = true;
    }

    public final z s() {
        z zVar = new z();
        Iterator itA = AbstractC3966c.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                Pd.b bVar = obj instanceof Pd.b ? (Pd.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    StringsKt.O(name, "is", false, 2, null);
                    kotlin.reflect.d dVarB = kotlin.jvm.internal.F.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(bVar.a(this, new kotlin.jvm.internal.w(dVarB, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean u() {
        return ((Boolean) this.f1970s.a(this, f1926Z[17])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f1941O.a(this, f1926Z[39])).booleanValue();
    }

    public Function1 w() {
        return (Function1) this.f1939M.a(this, f1926Z[37]);
    }

    public boolean x() {
        return ((Boolean) this.f1950X.a(this, f1926Z[48])).booleanValue();
    }

    public boolean y() {
        return ((Boolean) this.f1960i.a(this, f1926Z[7])).booleanValue();
    }

    public InterfaceC0906b z() {
        return (InterfaceC0906b) this.f1953b.a(this, f1926Z[0]);
    }
}
