package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public interface T extends U {

    public interface a extends U, Cloneable {
        T G();

        a H1(AbstractC3142h abstractC3142h, C3151q c3151q);

        T build();

        a e0(T t10);

        a h0(AbstractC3143i abstractC3143i, C3151q c3151q);
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    void writeTo(AbstractC3145k abstractC3145k);
}
