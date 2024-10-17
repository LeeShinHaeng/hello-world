function increase(number, callback) {
  const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
      const result = number + 10;
      if (result > 50) {
        const e = new Error("Number Too Big");
        return reject(e);
      }
      resolve(result);
    }, 1000);
  });

  return promise;
}

async function runtask() {
  try {
    let result = await increase(0);
  } catch (e) {
    console.log(e);
  }
}