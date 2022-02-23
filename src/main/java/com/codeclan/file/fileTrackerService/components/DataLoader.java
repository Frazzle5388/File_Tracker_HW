package com.codeclan.file.fileTrackerService.components;

import com.codeclan.file.fileTrackerService.models.File;
import com.codeclan.file.fileTrackerService.models.Folder;
import com.codeclan.file.fileTrackerService.models.User;
import com.codeclan.file.fileTrackerService.repositories.FileRepository;
import com.codeclan.file.fileTrackerService.repositories.FolderRepository;
import com.codeclan.file.fileTrackerService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User fraser = new User("Fraser");
        userRepository.save(fraser);

        User lewis = new User("Lewis");
        userRepository.save(lewis);

        User fergus = new User("Fergus");
        userRepository.save(fergus);

        Folder bills = new Folder("Bills", fraser);
        folderRepository.save(bills);

        Folder music = new Folder("Music", lewis);
        folderRepository.save(music);

        Folder italiano = new Folder("Italiano", fergus);
        folderRepository.save(italiano);

        File electricity = new File("Electricity", "PDF", 5, bills);
        fileRepository.save(electricity);

        File water = new File("Water", "PDF", 7, bills);
        fileRepository.save(water);

        File song1 = new File("Song 1", "MP3", 18, music);
        fileRepository.save(song1);

        File song2 = new File("Song 2", "MP3", 87, music);
        fileRepository.save(song2);

        File ciao = new File("Ciao", "MP3", 7, italiano);
        fileRepository.save(ciao);

    }
}
