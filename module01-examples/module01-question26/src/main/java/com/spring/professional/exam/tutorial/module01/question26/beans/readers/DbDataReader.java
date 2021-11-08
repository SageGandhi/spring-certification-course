package com.spring.professional.exam.tutorial.module01.question26.beans.readers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("database")
public class DbDataReader implements DataReader {
}
