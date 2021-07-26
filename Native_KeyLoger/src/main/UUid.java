package main;

import java.util.UUID;

public class UUid {
	public static void main(String[] args) throws InterruptedException {

		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		System.out.println(uuid);

	}

}
