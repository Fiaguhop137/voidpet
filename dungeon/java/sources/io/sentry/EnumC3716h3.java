package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3716h3 implements B0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    /* JADX INFO: renamed from: io.sentry.h3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3716h3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            return EnumC3716h3.valueOfLabel(interfaceC3724j1.j2().toLowerCase(Locale.ROOT));
        }
    }

    EnumC3716h3(String str) {
        this.itemType = str;
    }

    public static EnumC3716h3 resolve(Object obj) {
        if (obj instanceof V2) {
            return ((V2) obj).C().g() == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.E) {
            return Transaction;
        }
        if (obj instanceof O3) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static EnumC3716h3 valueOfLabel(String str) {
        for (EnumC3716h3 enumC3716h3 : values()) {
            if (enumC3716h3.itemType.equals(str)) {
                return enumC3716h3;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.B0
    public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
        interfaceC3729k1.e(this.itemType);
    }
}
