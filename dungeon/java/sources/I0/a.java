package I0;

import J0.s;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LocaleList f4895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f4896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f4897c = new s();

    @Override // I0.f
    public e a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f4897c) {
            e eVar = this.f4896b;
            if (eVar != null && localeList == this.f4895a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            e eVar2 = new e(arrayList);
            this.f4895a = localeList;
            this.f4896b = eVar2;
            return eVar2;
        }
    }

    @Override // I0.f
    public Locale b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.b(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(b.f4898a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
