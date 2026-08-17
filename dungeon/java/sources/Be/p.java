package Be;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends q {

    public interface a extends Cloneable, q {
        a T0(e eVar, g gVar);

        p build();
    }

    void b(f fVar);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
