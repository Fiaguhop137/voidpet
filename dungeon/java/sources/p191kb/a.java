package p191kb;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f48041a;

    public a() {
        this.f48041a = new HashMap();
    }

    public a(Map map) {
        this.f48041a = map;
    }

    @Override // p191kb.b
    public Object a(String str) {
        return this.f48041a.get(str);
    }

    @Override // p191kb.b
    public Collection c() {
        return this.f48041a.keySet();
    }

    @Override // p191kb.b
    public List e(String str, List list) {
        Object obj = this.f48041a.get(str);
        return obj instanceof List ? (List) obj : list;
    }

    @Override // p191kb.b
    public Map f(String str, Map map) {
        Object obj = this.f48041a.get(str);
        return obj instanceof Map ? (Map) obj : map;
    }

    @Override // p191kb.b
    public boolean g(String str) {
        return this.f48041a.containsKey(str);
    }

    @Override // p191kb.b
    public boolean getBoolean(String str, boolean z10) {
        Object obj = this.f48041a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    @Override // p191kb.b
    public int getInt(String str, int i10) {
        Object obj = this.f48041a.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    @Override // p191kb.b
    public String getString(String str, String str2) {
        Object obj = this.f48041a.get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
