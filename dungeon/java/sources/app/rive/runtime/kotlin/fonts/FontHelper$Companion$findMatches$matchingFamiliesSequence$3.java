package app.rive.runtime.kotlin.fonts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "family", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "invoke", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Family;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FontHelper$Companion$findMatches$matchingFamiliesSequence$3 extends o implements Function1<Fonts.Family, Boolean> {
    final /* synthetic */ String $familyName;
    final /* synthetic */ String $lang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontHelper$Companion$findMatches$matchingFamiliesSequence$3(String str, String str2) {
        super(1);
        this.$familyName = str;
        this.$lang = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Fonts.Family family) {
        Intrinsics.checkNotNullParameter(family, "family");
        boolean z10 = true;
        if ((this.$familyName != null && !StringsKt.z(family.getName(), this.$familyName, true)) || (this.$lang != null && !Intrinsics.b(family.getLang(), this.$lang))) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
