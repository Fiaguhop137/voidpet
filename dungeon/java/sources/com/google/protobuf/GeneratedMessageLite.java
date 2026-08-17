package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC3131a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w0 unknownFields = w0.c();

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite implements U {
        protected C3155v extensions = C3155v.h();

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f37789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f37790b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f37791c;

            private a(boolean z10) {
                Iterator itW = ExtendableMessage.this.extensions.w();
                this.f37789a = itW;
                if (itW.hasNext()) {
                    this.f37790b = (Map.Entry) itW.next();
                }
                this.f37791c = z10;
            }

            /* synthetic */ a(ExtendableMessage extendableMessage, boolean z10, a aVar) {
                this(z10);
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC3143i abstractC3143i, e eVar, C3151q c3151q, int i10) throws IOException {
            parseExtension(abstractC3143i, c3151q, eVar, C0.c(i10, 2), i10);
        }

        private void mergeMessageSetExtensionFromBytes(AbstractC3142h abstractC3142h, C3151q c3151q, e eVar) throws IOException {
            T t10 = (T) this.extensions.i(eVar.f37805d);
            T.a builder = t10 != null ? t10.toBuilder() : null;
            if (builder == null) {
                builder = eVar.e().newBuilderForType();
            }
            builder.H1(abstractC3142h, c3151q);
            ensureExtensionsAreMutable().C(eVar.f37805d, eVar.i(builder.build()));
        }

        private <MessageType extends T> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC3143i abstractC3143i, C3151q c3151q) throws IOException {
            int iK = 0;
            AbstractC3142h abstractC3142hR = null;
            e eVarA = null;
            while (true) {
                int iJ = abstractC3143i.J();
                if (iJ == 0) {
                    break;
                }
                if (iJ == C0.f37690c) {
                    iK = abstractC3143i.K();
                    if (iK != 0) {
                        eVarA = c3151q.a(messagetype, iK);
                    }
                } else if (iJ == C0.f37691d) {
                    if (iK == 0 || eVarA == null) {
                        abstractC3142hR = abstractC3143i.r();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC3143i, eVarA, c3151q, iK);
                        abstractC3142hR = null;
                    }
                } else if (!abstractC3143i.M(iJ)) {
                    break;
                }
            }
            abstractC3143i.a(C0.f37689b);
            if (abstractC3142hR == null || iK == 0) {
                return;
            }
            if (eVarA != null) {
                mergeMessageSetExtensionFromBytes(abstractC3142hR, c3151q, eVarA);
            } else {
                mergeLengthDelimitedField(iK, abstractC3142hR);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean parseExtension(AbstractC3143i abstractC3143i, C3151q c3151q, e eVar, int i10, int i11) throws IOException {
            boolean z10;
            boolean z11;
            Object objBuild;
            T t10;
            int iB = C0.b(i10);
            if (eVar == null) {
                z11 = true;
                z10 = false;
            } else if (iB == C3155v.o(eVar.f37805d.j(), false)) {
                z11 = false;
                z10 = false;
            } else {
                d dVar = eVar.f37805d;
                if (dVar.f37800d && dVar.f37799c.h() && iB == C3155v.o(eVar.f37805d.j(), true)) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
            if (z11) {
                return parseUnknownField(i10, abstractC3143i);
            }
            ensureExtensionsAreMutable();
            if (z10) {
                int iP = abstractC3143i.p(abstractC3143i.B());
                if (eVar.f37805d.j() == C0.b.f37706p) {
                    while (abstractC3143i.e() > 0) {
                        A.c cVarA = eVar.f37805d.g().a(abstractC3143i.t());
                        if (cVarA == null) {
                            return true;
                        }
                        this.extensions.a(eVar.f37805d, eVar.i(cVarA));
                    }
                } else {
                    while (abstractC3143i.e() > 0) {
                        this.extensions.a(eVar.f37805d, C3155v.B(abstractC3143i, eVar.f37805d.j(), false));
                    }
                }
                abstractC3143i.o(iP);
            } else {
                int i12 = a.f37793a[eVar.f37805d.l().ordinal()];
                if (i12 == 1) {
                    T.a builder = (eVar.f37805d.f() || (t10 = (T) this.extensions.i(eVar.f37805d)) == null) ? null : t10.toBuilder();
                    if (builder == null) {
                        builder = eVar.e().newBuilderForType();
                    }
                    if (eVar.f37805d.j() == C0.b.f37702l) {
                        abstractC3143i.x(eVar.f(), builder, c3151q);
                    } else {
                        abstractC3143i.A(builder, c3151q);
                    }
                    objBuild = builder.build();
                } else if (i12 != 2) {
                    objBuild = C3155v.B(abstractC3143i, eVar.f37805d.j(), false);
                } else {
                    int iT = abstractC3143i.t();
                    A.c cVarA2 = eVar.f37805d.g().a(iT);
                    if (cVarA2 == null) {
                        mergeVarintField(i11, iT);
                        return true;
                    }
                    objBuild = cVarA2;
                }
                if (eVar.f37805d.f()) {
                    this.extensions.a(eVar.f37805d, eVar.i(objBuild));
                } else {
                    this.extensions.C(eVar.f37805d, eVar.i(objBuild));
                }
            }
            return true;
        }

        private void verifyExtensionContainingType(e eVar) {
            if (eVar.c() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        C3155v ensureExtensionsAreMutable() {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.s();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.n();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.j();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.U
        public /* bridge */ /* synthetic */ T getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(AbstractC3149o abstractC3149o) {
            e eVarB = GeneratedMessageLite.b(abstractC3149o);
            verifyExtensionContainingType(eVarB);
            Object objI = this.extensions.i(eVarB.f37805d);
            return objI == null ? (Type) eVarB.f37803b : (Type) eVarB.b(objI);
        }

        public final <Type> Type getExtension(AbstractC3149o abstractC3149o, int i10) {
            e eVarB = GeneratedMessageLite.b(abstractC3149o);
            verifyExtensionContainingType(eVarB);
            return (Type) eVarB.h(this.extensions.l(eVarB.f37805d, i10));
        }

        public final <Type> int getExtensionCount(AbstractC3149o abstractC3149o) {
            e eVarB = GeneratedMessageLite.b(abstractC3149o);
            verifyExtensionContainingType(eVarB);
            return this.extensions.m(eVarB.f37805d);
        }

        public final <Type> boolean hasExtension(AbstractC3149o abstractC3149o) {
            e eVarB = GeneratedMessageLite.b(abstractC3149o);
            verifyExtensionContainingType(eVarB);
            return this.extensions.p(eVarB.f37805d);
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.y(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.T
        public /* bridge */ /* synthetic */ T.a newBuilderForType() {
            return super.newBuilderForType();
        }

        protected ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        protected ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        protected <MessageType extends T> boolean parseUnknownField(MessageType messagetype, AbstractC3143i abstractC3143i, C3151q c3151q, int i10) throws IOException {
            int iA = C0.a(i10);
            return parseExtension(abstractC3143i, c3151q, c3151q.a(messagetype, iA), i10, iA);
        }

        protected <MessageType extends T> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC3143i abstractC3143i, C3151q c3151q, int i10) throws IOException {
            if (i10 != C0.f37688a) {
                return C0.b(i10) == 2 ? parseUnknownField(messagetype, abstractC3143i, c3151q, i10) : abstractC3143i.M(i10);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC3143i, c3151q);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.T
        public /* bridge */ /* synthetic */ T.a toBuilder() {
            return super.toBuilder();
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37793a;

        static {
            int[] iArr = new int[C0.c.values().length];
            f37793a = iArr;
            try {
                iArr[C0.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37793a[C0.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends AbstractC3131a.AbstractC0413a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GeneratedMessageLite f37794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected GeneratedMessageLite f37795b;

        protected b(GeneratedMessageLite generatedMessageLite) {
            this.f37794a = generatedMessageLite;
            if (generatedMessageLite.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f37795b = w();
        }

        private static void v(Object obj, Object obj2) {
            j0.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite w() {
            return this.f37794a.newMutableInstance();
        }

        @Override // com.google.protobuf.U
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.f37795b, false);
        }

        @Override // com.google.protobuf.T.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLiteG = G();
            if (generatedMessageLiteG.isInitialized()) {
                return generatedMessageLiteG;
            }
            throw AbstractC3131a.AbstractC0413a.j(generatedMessageLiteG);
        }

        @Override // com.google.protobuf.T.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite G() {
            if (!this.f37795b.isMutable()) {
                return this.f37795b;
            }
            this.f37795b.makeImmutable();
            return this.f37795b;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            bVarNewBuilderForType.f37795b = G();
            return bVarNewBuilderForType;
        }

        protected final void o() {
            if (this.f37795b.isMutable()) {
                return;
            }
            p();
        }

        protected void p() {
            GeneratedMessageLite generatedMessageLiteW = w();
            v(generatedMessageLiteW, this.f37795b);
            this.f37795b = generatedMessageLiteW;
        }

        @Override // com.google.protobuf.U
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.f37794a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC3131a.AbstractC0413a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e(GeneratedMessageLite generatedMessageLite) {
            return u(generatedMessageLite);
        }

        @Override // com.google.protobuf.T.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b h0(AbstractC3143i abstractC3143i, C3151q c3151q) throws IOException {
            o();
            try {
                j0.a().d(this.f37795b).i(this.f37795b, C3144j.P(abstractC3143i), c3151q);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public b u(GeneratedMessageLite generatedMessageLite) {
            if (getDefaultInstanceForType().equals(generatedMessageLite)) {
                return this;
            }
            o();
            v(this.f37795b, generatedMessageLite);
            return this;
        }
    }

    protected static class c extends AbstractC3133b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final GeneratedMessageLite f37796b;

        public c(GeneratedMessageLite generatedMessageLite) {
            this.f37796b = generatedMessageLite;
        }
    }

    static final class d implements C3155v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final A.d f37797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f37798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C0.b f37799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f37800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f37801e;

        d(A.d dVar, int i10, C0.b bVar, boolean z10, boolean z11) {
            this.f37797a = dVar;
            this.f37798b = i10;
            this.f37799c = bVar;
            this.f37800d = z10;
            this.f37801e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f37798b - dVar.f37798b;
        }

        @Override // com.google.protobuf.C3155v.b
        public boolean f() {
            return this.f37800d;
        }

        public A.d g() {
            return this.f37797a;
        }

        @Override // com.google.protobuf.C3155v.b
        public int getNumber() {
            return this.f37798b;
        }

        @Override // com.google.protobuf.C3155v.b
        public C0.b j() {
            return this.f37799c;
        }

        @Override // com.google.protobuf.C3155v.b
        public boolean k() {
            return this.f37801e;
        }

        @Override // com.google.protobuf.C3155v.b
        public C0.c l() {
            return this.f37799c.e();
        }

        @Override // com.google.protobuf.C3155v.b
        public T.a m(T.a aVar, T t10) {
            return ((b) aVar).u((GeneratedMessageLite) t10);
        }
    }

    public static class e extends AbstractC3149o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f37802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f37803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f37804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f37805d;

        e(T t10, Object obj, T t11, d dVar, Class cls) {
            if (t10 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (dVar.j() == C0.b.f37703m && t11 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f37802a = t10;
            this.f37803b = obj;
            this.f37804c = t11;
            this.f37805d = dVar;
        }

        Object b(Object obj) {
            if (!this.f37805d.f()) {
                return h(obj);
            }
            if (this.f37805d.l() != C0.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(h(it.next()));
            }
            return arrayList;
        }

        public T c() {
            return this.f37802a;
        }

        public C0.b d() {
            return this.f37805d.j();
        }

        public T e() {
            return this.f37804c;
        }

        public int f() {
            return this.f37805d.getNumber();
        }

        public boolean g() {
            return this.f37805d.f37800d;
        }

        Object h(Object obj) {
            return this.f37805d.l() == C0.c.ENUM ? this.f37805d.f37797a.a(((Integer) obj).intValue()) : obj;
        }

        Object i(Object obj) {
            return this.f37805d.l() == C0.c.ENUM ? Integer.valueOf(((A.c) obj).getNumber()) : obj;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e b(AbstractC3149o abstractC3149o) {
        if (abstractC3149o.a()) {
            return (e) abstractC3149o;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static GeneratedMessageLite c(GeneratedMessageLite generatedMessageLite) throws B {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.newUninitializedMessageException().a().k(generatedMessageLite);
    }

    private int d(n0 n0Var) {
        return n0Var == null ? j0.a().d(this).e(this) : n0Var.e(this);
    }

    private void e() {
        if (this.unknownFields == w0.c()) {
            this.unknownFields = w0.o();
        }
    }

    protected static A.a emptyBooleanList() {
        return C3140f.i();
    }

    protected static A.b emptyDoubleList() {
        return C3147m.i();
    }

    protected static A.f emptyFloatList() {
        return C3157x.i();
    }

    protected static A.g emptyIntList() {
        return C3159z.i();
    }

    protected static A.h emptyLongList() {
        return J.i();
    }

    protected static <E> A.i emptyProtobufList() {
        return k0.e();
    }

    private static GeneratedMessageLite f(GeneratedMessageLite generatedMessageLite, InputStream inputStream, C3151q c3151q) throws B {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            AbstractC3143i abstractC3143iH = AbstractC3143i.h(new AbstractC3131a.AbstractC0413a.C0414a(inputStream, AbstractC3143i.C(i10, inputStream)));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC3143iH, c3151q);
            try {
                abstractC3143iH.a(0);
                return partialFrom;
            } catch (B e10) {
                throw e10.k(partialFrom);
            }
        } catch (B e11) {
            if (e11.a()) {
                throw new B(e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new B(e12);
        }
    }

    private static GeneratedMessageLite g(GeneratedMessageLite generatedMessageLite, AbstractC3142h abstractC3142h, C3151q c3151q) throws B {
        AbstractC3143i abstractC3143iS = abstractC3142h.s();
        GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC3143iS, c3151q);
        try {
            abstractC3143iS.a(0);
            return partialFrom;
        } catch (B e10) {
            throw e10.k(partialFrom);
        }
    }

    static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((GeneratedMessageLite) z0.l(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GeneratedMessageLite h(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i10, int i11, C3151q c3151q) throws B {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            n0 n0VarD = j0.a().d(generatedMessageLiteNewMutableInstance);
            n0VarD.j(generatedMessageLiteNewMutableInstance, bArr, i10, i10 + i11, new AbstractC3139e.b(c3151q));
            n0VarD.c(generatedMessageLiteNewMutableInstance);
            return generatedMessageLiteNewMutableInstance;
        } catch (B e10) {
            B b10 = e10;
            if (b10.a()) {
                b10 = new B(b10);
            }
            throw b10.k(generatedMessageLiteNewMutableInstance);
        } catch (u0 e11) {
            throw e11.a().k(generatedMessageLiteNewMutableInstance);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).k(generatedMessageLiteNewMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw B.m().k(generatedMessageLiteNewMutableInstance);
        }
    }

    static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends GeneratedMessageLite> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = j0.a().d(t10).d(t10);
        if (z10) {
            t10.dynamicMethod(f.SET_MEMOIZED_IS_INITIALIZED, zD ? t10 : null);
        }
        return zD;
    }

    protected static A.a mutableCopy(A.a aVar) {
        int size = aVar.size();
        return aVar.f(size == 0 ? 10 : size * 2);
    }

    protected static A.b mutableCopy(A.b bVar) {
        int size = bVar.size();
        return bVar.f(size == 0 ? 10 : size * 2);
    }

    protected static A.f mutableCopy(A.f fVar) {
        int size = fVar.size();
        return fVar.f(size == 0 ? 10 : size * 2);
    }

    protected static A.g mutableCopy(A.g gVar) {
        int size = gVar.size();
        return gVar.f(size == 0 ? 10 : size * 2);
    }

    protected static A.h mutableCopy(A.h hVar) {
        int size = hVar.size();
        return hVar.f(size == 0 ? 10 : size * 2);
    }

    protected static <E> A.i mutableCopy(A.i iVar) {
        int size = iVar.size();
        return iVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object newMessageInfo(T t10, String str, Object[] objArr) {
        return new l0(t10, str, objArr);
    }

    public static <ContainingType extends T, Type> e newRepeatedGeneratedExtension(ContainingType containingtype, T t10, A.d dVar, int i10, C0.b bVar, boolean z10, Class cls) {
        return new e(containingtype, Collections.EMPTY_LIST, t10, new d(dVar, i10, bVar, true, z10), cls);
    }

    public static <ContainingType extends T, Type> e newSingularGeneratedExtension(ContainingType containingtype, Type type, T t10, A.d dVar, int i10, C0.b bVar, Class cls) {
        return new e(containingtype, type, t10, new d(dVar, i10, bVar, false, false), cls);
    }

    protected static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t10, InputStream inputStream) throws B {
        return (T) c(f(t10, inputStream, C3151q.b()));
    }

    protected static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t10, InputStream inputStream, C3151q c3151q) throws B {
        return (T) c(f(t10, inputStream, c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3142h abstractC3142h) throws B {
        return (T) c(parseFrom(t10, abstractC3142h, C3151q.b()));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3142h abstractC3142h, C3151q c3151q) throws B {
        return (T) c(g(t10, abstractC3142h, c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3143i abstractC3143i) throws B {
        return (T) parseFrom(t10, abstractC3143i, C3151q.b());
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3143i abstractC3143i, C3151q c3151q) throws B {
        return (T) c(parsePartialFrom(t10, abstractC3143i, c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, InputStream inputStream) throws B {
        return (T) c(parsePartialFrom(t10, AbstractC3143i.h(inputStream), C3151q.b()));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, InputStream inputStream, C3151q c3151q) throws B {
        return (T) c(parsePartialFrom(t10, AbstractC3143i.h(inputStream), c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, ByteBuffer byteBuffer) throws B {
        return (T) parseFrom(t10, byteBuffer, C3151q.b());
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, ByteBuffer byteBuffer, C3151q c3151q) throws B {
        return (T) c(parseFrom(t10, AbstractC3143i.j(byteBuffer), c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, byte[] bArr) throws B {
        return (T) c(h(t10, bArr, 0, bArr.length, C3151q.b()));
    }

    protected static <T extends GeneratedMessageLite> T parseFrom(T t10, byte[] bArr, C3151q c3151q) throws B {
        return (T) c(h(t10, bArr, 0, bArr.length, c3151q));
    }

    protected static <T extends GeneratedMessageLite> T parsePartialFrom(T t10, AbstractC3143i abstractC3143i) throws B {
        return (T) parsePartialFrom(t10, abstractC3143i, C3151q.b());
    }

    static <T extends GeneratedMessageLite> T parsePartialFrom(T t10, AbstractC3143i abstractC3143i, C3151q c3151q) throws B {
        T t11 = (T) t10.newMutableInstance();
        try {
            n0 n0VarD = j0.a().d(t11);
            n0VarD.i(t11, C3144j.P(abstractC3143i), c3151q);
            n0VarD.c(t11);
            return t11;
        } catch (B e10) {
            e = e10;
            if (e.a()) {
                e = new B(e);
            }
            throw e.k(t11);
        } catch (u0 e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof B) {
                throw ((B) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    Object buildMessageInfo() throws Exception {
        return dynamicMethod(f.BUILD_MESSAGE_INFO);
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return j0.a().d(this).f(this);
    }

    protected final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(f.NEW_BUILDER);
    }

    protected final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().u(messagetype);
    }

    protected Object dynamicMethod(f fVar) {
        return dynamicMethod(fVar, null, null);
    }

    protected Object dynamicMethod(f fVar, Object obj) {
        return dynamicMethod(fVar, obj, null);
    }

    protected abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return j0.a().d(this).g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.U
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(f.GET_DEFAULT_INSTANCE);
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final g0 getParserForType() {
        return (g0) dynamicMethod(f.GET_PARSER);
    }

    @Override // com.google.protobuf.T
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.AbstractC3131a
    int getSerializedSize(n0 n0Var) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iD = d(n0Var);
            setMemoizedSerializedSize(iD);
            return iD;
        }
        int iD2 = d(n0Var);
        if (iD2 >= 0) {
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.U
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void makeImmutable() {
        j0.a().d(this).c(this);
        markImmutable();
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void mergeLengthDelimitedField(int i10, AbstractC3142h abstractC3142h) {
        e();
        this.unknownFields.l(i10, abstractC3142h);
    }

    protected final void mergeUnknownFields(w0 w0Var) {
        this.unknownFields = w0.n(this.unknownFields, w0Var);
    }

    protected void mergeVarintField(int i10, int i11) {
        e();
        this.unknownFields.m(i10, i11);
    }

    @Override // com.google.protobuf.T
    public final b newBuilderForType() {
        return (b) dynamicMethod(f.NEW_BUILDER);
    }

    GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(f.NEW_MUTABLE_INSTANCE);
    }

    protected boolean parseUnknownField(int i10, AbstractC3143i abstractC3143i) throws IOException {
        if (C0.b(i10) == 4) {
            return false;
        }
        e();
        return this.unknownFields.i(i10, abstractC3143i);
    }

    void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.protobuf.T
    public final b toBuilder() {
        return ((b) dynamicMethod(f.NEW_BUILDER)).u(this);
    }

    public String toString() {
        return V.f(this, super.toString());
    }

    @Override // com.google.protobuf.T
    public void writeTo(AbstractC3145k abstractC3145k) throws IOException {
        j0.a().d(this).h(this, C3146l.P(abstractC3145k));
    }
}
