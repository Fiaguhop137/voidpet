package Pf;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements InterfaceC1301e, Ug.c {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC1301e) {
            return g().q(((InterfaceC1301e) obj).g());
        }
        return false;
    }

    @Override // Pf.InterfaceC1301e
    public abstract AbstractC1333y g();

    @Override // Ug.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g().n(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return g().hashCode();
    }

    public byte[] i(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g().o(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
