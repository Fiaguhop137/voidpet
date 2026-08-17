package p025b6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f26283c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f26284a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f26285b;

    @Override // p025b6.e
    public boolean T3() {
        return false;
    }

    @Override // p025b6.e
    public p d3() {
        return o.f26315d;
    }

    @Override // H5.a
    public void f(String str, Object obj) {
        if (f26283c.contains(str)) {
            this.f26284a.put(str, obj);
        }
    }

    @Override // p025b6.l, H5.a
    public Map getExtras() {
        return this.f26284a;
    }

    @Override // p025b6.e
    public m j3() {
        if (this.f26285b == null) {
            this.f26285b = new n(getWidth(), getHeight(), M(), d3(), getExtras());
        }
        return this.f26285b;
    }

    @Override // H5.a
    public void m(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f26283c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f26284a.put(str, obj);
            }
        }
    }
}
