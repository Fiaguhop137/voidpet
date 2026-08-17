package Y3;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f16935a;

    p(List list) {
        this.f16935a = list;
    }

    @Override // Y3.o
    public boolean j() {
        return this.f16935a.isEmpty() || (this.f16935a.size() == 1 && ((p095f4.a) this.f16935a.get(0)).i());
    }

    @Override // Y3.o
    public List l() {
        return this.f16935a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f16935a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f16935a.toArray()));
        }
        return sb2.toString();
    }
}
