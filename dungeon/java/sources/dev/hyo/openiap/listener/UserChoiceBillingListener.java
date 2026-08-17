package dev.hyo.openiap.listener;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/listener/UserChoiceBillingListener;", "", "onUserSelectedAlternativeBilling", "", "details", "Ldev/hyo/openiap/listener/UserChoiceDetails;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserChoiceBillingListener {
    void onUserSelectedAlternativeBilling(@NotNull UserChoiceDetails details);
}
