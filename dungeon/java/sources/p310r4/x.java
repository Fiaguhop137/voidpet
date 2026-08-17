package p310r4;

import L4.h;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p274p4.f;
import p274p4.l;
import p328s4.b;

/* JADX INFO: loaded from: classes.dex */
final class x implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f52374j = new h(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f52375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f52376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f52377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f52378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f52379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f52380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p274p4.h f52381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f52382i;

    x(b bVar, f fVar, f fVar2, int i10, int i11, l lVar, Class cls, p274p4.h hVar) {
        this.f52375b = bVar;
        this.f52376c = fVar;
        this.f52377d = fVar2;
        this.f52378e = i10;
        this.f52379f = i11;
        this.f52382i = lVar;
        this.f52380g = cls;
        this.f52381h = hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] c() {
        h hVar = f52374j;
        byte[] bArr = (byte[]) hVar.g(this.f52380g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f52380g.getName().getBytes(f.f50778a);
        hVar.k(this.f52380g, bytes);
        return bytes;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f52375b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f52378e).putInt(this.f52379f).array();
        this.f52377d.b(messageDigest);
        this.f52376c.b(messageDigest);
        messageDigest.update(bArr);
        l lVar = this.f52382i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f52381h.b(messageDigest);
        messageDigest.update(c());
        this.f52375b.put(bArr);
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f52379f == xVar.f52379f && this.f52378e == xVar.f52378e && L4.l.e(this.f52382i, xVar.f52382i) && this.f52380g.equals(xVar.f52380g) && this.f52376c.equals(xVar.f52376c) && this.f52377d.equals(xVar.f52377d) && this.f52381h.equals(xVar.f52381h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        int iHashCode = (((((this.f52376c.hashCode() * 31) + this.f52377d.hashCode()) * 31) + this.f52378e) * 31) + this.f52379f;
        l lVar = this.f52382i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f52380g.hashCode()) * 31) + this.f52381h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f52376c + ", signature=" + this.f52377d + ", width=" + this.f52378e + ", height=" + this.f52379f + ", decodedResourceClass=" + this.f52380g + ", transformation='" + this.f52382i + "', options=" + this.f52381h + '}';
    }
}
