package Ne;

import Pe.InterfaceC1291s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;

/* JADX INFO: renamed from: Ne.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1246u extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p410we.a f8213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1291s f8214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p410we.e f8215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M f8216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p374ue.n f8217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Ke.k f8218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1246u(p464ze.c fqName, Qe.n storageManager, p015ae.H module, p374ue.n proto, p410we.a metadataVersion, InterfaceC1291s interfaceC1291s) {
        super(fqName, storageManager, module);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f8213h = metadataVersion;
        this.f8214i = interfaceC1291s;
        p374ue.q qVarI = proto.I();
        Intrinsics.checkNotNullExpressionValue(qVarI, "getStrings(...)");
        p374ue.p pVarH = proto.H();
        Intrinsics.checkNotNullExpressionValue(pVarH, "getQualifiedNames(...)");
        p410we.e eVar = new p410we.e(qVarI, pVarH);
        this.f8215j = eVar;
        this.f8216k = new M(proto, eVar, metadataVersion, new C1244s(this));
        this.f8217l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 O0(AbstractC1246u abstractC1246u, p464ze.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC1291s interfaceC1291s = abstractC1246u.f8214i;
        if (interfaceC1291s != null) {
            return interfaceC1291s;
        }
        h0 NO_SOURCE = h0.f19733a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Q0(AbstractC1246u abstractC1246u) {
        Collection collectionB = abstractC1246u.G0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            p464ze.b bVar = (p464ze.b) obj;
            if (!bVar.j() && !C1238l.f8169c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p464ze.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // Ne.r
    public void L0(C1240n components) {
        Intrinsics.checkNotNullParameter(components, "components");
        p374ue.n nVar = this.f8217l;
        if (nVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f8217l = null;
        p374ue.m mVarG = nVar.G();
        Intrinsics.checkNotNullExpressionValue(mVarG, "getPackage(...)");
        this.f8218m = new Pe.M(this, mVarG, this.f8215j, this.f8213h, this.f8214i, components, "scope of " + this, new C1245t(this));
    }

    @Override // Ne.r
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public M G0() {
        return this.f8216k;
    }

    @Override // p015ae.N
    public Ke.k o() {
        Ke.k kVar = this.f8218m;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("_memberScope");
        return null;
    }
}
