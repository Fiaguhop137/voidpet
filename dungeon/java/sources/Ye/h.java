package Ye;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.f f17835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Regex f17836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f17837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f17838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f17839e;

    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17840a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1811z interfaceC1811z) {
            Intrinsics.checkNotNullParameter(interfaceC1811z, "<this>");
            return null;
        }
    }

    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17841a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1811z interfaceC1811z) {
            Intrinsics.checkNotNullParameter(interfaceC1811z, "<this>");
            return null;
        }
    }

    static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17842a = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1811z interfaceC1811z) {
            Intrinsics.checkNotNullParameter(interfaceC1811z, "<this>");
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, f[] checks, Function1 additionalChecks) {
        this((p464ze.f) null, (Regex) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f17842a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Regex regex, f[] checks, Function1 additionalChecks) {
        this((p464ze.f) null, regex, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Regex regex, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, fVarArr, (i10 & 4) != 0 ? b.f17841a : function1);
    }

    private h(p464ze.f fVar, Regex regex, Collection collection, Function1 function1, f... fVarArr) {
        this.f17835a = fVar;
        this.f17836b = regex;
        this.f17837c = collection;
        this.f17838d = function1;
        this.f17839e = fVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(p464ze.f name, f[] checks, Function1 additionalChecks) {
        this(name, (Regex) null, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(p464ze.f fVar, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f17840a : function1);
    }

    public final g a(InterfaceC1811z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f17839e) {
            String strI = fVar.i(functionDescriptor);
            if (strI != null) {
                return new g.b(strI);
            }
        }
        String str = (String) this.f17838d.invoke(functionDescriptor);
        return str != null ? new g.b(str) : g.c.f17834b;
    }

    public final boolean b(InterfaceC1811z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        if (this.f17835a != null && !Intrinsics.b(functionDescriptor.getName(), this.f17835a)) {
            return false;
        }
        if (this.f17836b != null) {
            String strG = functionDescriptor.getName().g();
            Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
            if (!this.f17836b.d(strG)) {
                return false;
            }
        }
        Collection collection = this.f17837c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }
}
