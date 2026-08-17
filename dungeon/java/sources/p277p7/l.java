package p277p7;

import com.facebook.soloader.E;
import com.facebook.soloader.InterfaceC2301b;
import com.facebook.soloader.m;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes2.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (m mVar : eArr) {
            if (mVar instanceof InterfaceC2301b) {
                p.b("SoLoader", "Waiting on SoSource " + mVar.c());
                mVar.a();
            }
        }
        return true;
    }
}
