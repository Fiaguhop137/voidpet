package G3;

import If.InterfaceC1107i;
import If.InterfaceC1108j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3857a = new a();

    private a() {
    }

    public final q a(InterfaceC1108j interfaceC1108j) {
        int i10 = Integer.parseInt(interfaceC1108j.B1());
        long j10 = Long.parseLong(interfaceC1108j.B1());
        long j11 = Long.parseLong(interfaceC1108j.B1());
        n.a aVar = new n.a();
        int i11 = Integer.parseInt(interfaceC1108j.B1());
        for (int i12 = 0; i12 < i11; i12++) {
            H3.e.b(aVar, interfaceC1108j.B1());
        }
        return new q(i10, j10, j11, aVar.b(), null, null, 48, null);
    }

    public final void b(q qVar, InterfaceC1107i interfaceC1107i) {
        interfaceC1107i.Y1(qVar.d()).writeByte(10);
        interfaceC1107i.Y1(qVar.f()).writeByte(10);
        interfaceC1107i.Y1(qVar.g()).writeByte(10);
        Set<Map.Entry> setEntrySet = qVar.e().b().entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        interfaceC1107i.Y1(size).writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                interfaceC1107i.Z0((String) entry.getKey()).Z0(":").Z0((String) it2.next()).writeByte(10);
            }
        }
    }
}
