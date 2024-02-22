package com.github.novicezk.midjourney;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Constants {
	// 任务扩展属性 start
	public static final String TASK_PROPERTY_NOTIFY_HOOK = "notifyHook";
	public static final String TASK_PROPERTY_FINAL_PROMPT = "finalPrompt";
	public static final String TASK_PROPERTY_MESSAGE_ID = "messageId";
	public static final String TASK_PROPERTY_MESSAGE_HASH = "messageHash";
	public static final String TASK_PROPERTY_PROGRESS_MESSAGE_ID = "progressMessageId";
	public static final String TASK_PROPERTY_FLAGS = "flags";
	public static final String TASK_PROPERTY_NONCE = "nonce";
	public static final String TASK_PROPERTY_DISCORD_INSTANCE_ID = "discordInstanceId";
	// 任务扩展属性 end

	public static final String API_SECRET_HEADER_NAME = "mj-api-secret";
	public static final String DEFAULT_DISCORD_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/118.0";
}
